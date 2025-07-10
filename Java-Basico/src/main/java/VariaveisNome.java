public class VariaveisNome {
    public static void main(String[] args) {
        // Regras do Java - Permitido!
        int abc;
        int abc42;
        int $var;
        int _var;
        int var__;
        int va$r;

        // Regras do Java - Não permitido!
        /*
        int 9abc;
        int xp?0;    // caractere especiais
        int class;   // nomeclatura especiais
        int package; // nomeclatura especiais
        */

        // regra importante
        int Home;
        int home; // uso diario
        int HOME; // conversão para constantes

        int numeroDeAno; // Camel-case
        int numero_para_ano; // não use!
    }
}
