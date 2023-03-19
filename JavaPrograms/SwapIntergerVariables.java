package JavaPrograms;
public class SwapIntergerVariables {

    public static void swapUsingThridVariable(int x, int y){
        int temp;
        System.out.println(x +" and "+ y);
        temp=x;
        x=y;
        y=temp;
        System.out.println(x +" and "+ y);
    }

    public static void swapUsingWithoutThridVariable(int x, int y){
        System.out.println(x +" and "+ y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x +" and "+ y);
    }

    public static void main(String[] args) {
        swapUsingThridVariable(5,10);
        swapUsingWithoutThridVariable(5,10);
        
    }
    
}
