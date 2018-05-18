
package produto;

/**
 *
 * @author rodol
 */
import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Este programa calcula o produto");
        
        int x,y,z,result;
        
        System.out.print("Insira o primeiro número: ");
        x = input.nextInt();
        System.out.print("Insira o segundo número: ");
        y = input.nextInt();
        System.out.print("Insira o terceiro número: ");
        z = input.nextInt();
        
        result = x*y*z;
        
        System.out.printf("O produlto é: %d%n", result);
    }
    
}
