package carManager;

//import java.util.Scanner;

public class AppVeiculo {
	
    public static void main(String[] args) {

        Veiculo[] veiculo = new Veiculo[4];
        veiculo[0] = new Veiculo("Grand Cherokee", "Jeep", 2019, 280000, "ABC-1234", "flex");
        veiculo[1] = new Veiculo("Compass", "Jeep", 2020, 120000, "DEF-4321", "gasolina");
        veiculo[2] = new Veiculo("Fusca", "Volkswagem", 1971, 12000, "LOL-9941", "gasolina");
        veiculo[3] = new Veiculo("Uno", "Fiat", 1996, 8000, "JKL-0018", "gasolina");
        
        veiculo[0].imprimir();
        veiculo[1].imprimir();
        veiculo[2].imprimir();
        veiculo[3].imprimir();

    }
}


//    public static void menu(){
//        System.out.println("\t Gerenciar carros");
//       
//        System.out.println("1. Inclui");
//        System.out.println("2. Exclui");
//        System.out.println("3. Busca todos");
//        System.out.println("4. Busca por placa");
//        System.out.println("5. Busca por combustivel");
//        System.out.println("6. Consulta taxa de imposto");
//        System.out.println("0. Finaliza");
//        System.out.print("Opcao: ");
//    }
//
//    public static void add(){
//        System.out.println("Você entrou no método Inclui.");
//    }
//    
//    public static void remove(){
//        System.out.println("Você entrou no método Altera.");
//    }
//    
//    public static void listAll(){
//        System.out.println("Você entrou no método Exclui.");
//    }
//    
//    public static void searchPlate(){
//        System.out.println("Você entrou no método Consulta.");
//    }
//
//    public static void searchFuel(){
//        System.out.println("Você entrou no método Consulta.");
//    }
//    
//    public static void taxRate(){
//        System.out.println("Você entrou no método Consulta.");
//    }
//    
//    public static void main(String[] args) {
//        int opcao;
//        Scanner entrada = new Scanner(System.in);
//        
//        do{
//            menu();
//            opcao = entrada.nextInt();
//            
//            switch(opcao){
//            case 1:
//                add();
//                break;
//                
//            case 2:
//                remove();
//                break;
//                
//            case 3:
//                listAll();
//                break;
//                
//            case 4:
//                searchPlate();
//                break;
//                
//            case 5:
//                searchFuel();
//                break;
//                
//            case 6:
//                taxRate();
//                break;
//                
//            default:
//                System.out.println("Opção inválida.");
//            }
//        } while(opcao != 0);
//        entrada.close();
//    }
//}
