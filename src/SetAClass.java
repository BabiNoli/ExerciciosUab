public class SetAClass implements Set {

    private static final int CAPACITY = 100;

    private  int[] elements;

    private int count;

    public SetAClass() {
        elements = new int[CAPACITY];
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int Get(int i) {
        if (i < 0 || i >= count){
            throw new IndexOutOfBoundsException("Indice invalido: " + i);
        }
        return elements[i];
    }

    @Override
    public void Store(int v){
        if (!Belongs(v)){
            if (count == CAPACITY){
                throw new RuntimeException("O conjunto está cheio! (Set is full)");
            }
            int pos = 0;
            while (pos < count && elements[pos] < v){
                pos++;
            }
            for (int j = count; j > pos; j--){
                elements[j] = elements[j - 1];
            }
            elements[pos] = v;
            count++;
        }
    }

    @Override
    public boolean Belongs(int v){
        for (int i = 0; i < count; i++){
            if (elements[i] == v){
                return true;
            }
        }
        return false;
    }

    @Override
    public Set Union(Set s) {
        SetAClass result = new SetAClass();
        for (int i = 0; i < this.count; i++){
            result.Store(s.Get(i));
        }
        return result;
    }

    @Override
    public void Print() {
        for (int i = 0; i < count; i++){
            System.out.print(elements[i] + " ");
        }
    }

    public Set Intersection(Set s){
        SetAClass result = new SetAClass();

        for (int i = 0; i < this.count; i++){
            int valor = this.elements[i];
            if (s.Belongs(valor)){
                result.Store(valor);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SetAClass set1 = new SetAClass();
        set1.Store(1);
        set1.Store(3);
        set1.Store(5);
        set1.Store(7);

        SetAClass set2 = new SetAClass();
        set2.Store(3);
        set2.Store(4);
        set2.Store(7);
        set2.Store(9);

        Set uniao = set1.Union(set2);
        Set intersec = set1.Intersection(uniao);

        System.out.println("set1.Size() = " + set1.size()); //Deve ser 4
        System.out.println("set2.Size() = " + set2.size());//Deve ser 4
        System.out.println("Uniao.size = " + uniao.size()); //Deve ser 6(1,3,4,5,7,9)
        System.out.println("Intersec.size = " + intersec.size()); //Deve ser 2 (3,7)

        System.out.println("Uniao: ");
        for (int i = 0; i < uniao.size(); i++){
            System.out.print(uniao.Get(i) + " ");
        }
        System.out.println();

        System.out.println("Interseção: ");
        for (int i = 0; i < intersec.size(); i++){
            System.out.print(intersec.Get(i) + " ");
        }
        System.out.println();

    }
}
