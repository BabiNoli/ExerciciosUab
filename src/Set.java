public interface Set {
    int size(); //Retorna a cardinalidade dum Conjunto
    int Get(int i); // Retorna o i-ésimo elemento dum conjunto.
    //Este método pressupoe que valores são internamente guardados numa determinada ordem.

    void Store(int v);
    //Acrescenta um inteiro a um Conjunto, caso nao esteja já no conjunto. Operacao destrutiva.

    boolean Belongs(int v);
    //Verifica se um inteiro pertence a um conjunto.
    Set Union(Set s);
    //Cria um Novo conjunto, cujo conteúdo reúne o conteúdo de dois conjuntos existentes.

    //Operacao nao destrutiva
    void Print();
    //Escreve no ecra um conjunto: entre chaves
}
