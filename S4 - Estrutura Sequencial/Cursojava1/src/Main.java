import java.util.Locale;
        public class Main {
            public static void main(String[] args) {

                String product1 = "Computador";
                String product2 = "Mesa de escritório";

                byte age = 30;
                int code = 5290;
                char gender = 'F';
                double price1 = 2100.0;
                double price2 = 650.50;
                double measure = 53.234567;

                System.out.println("Produtos:");
                System.out.printf("%s,O preço é R$ %.2f%n", product1, price1);
                System.out.printf("%s,O cujo preço é R$ %.2f%n", product2, price2);

                System.out.println();
                System.out.printf("Registro: %d anos de idade, código %d e gênero: %c%n", age, code, gender);

                System.out.println();
                System.out.printf("Medida com oito casas decimais: %.8f%n", measure);
                System.out.printf("Arredondada (três casas decimais): %.3f%n", measure);

                Locale.setDefault(Locale.US);
                System.out.printf("Ponto decimal no padrão US: %.3f%n", measure);
            }
        }
