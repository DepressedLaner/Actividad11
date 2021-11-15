package Actividad11;

public class trical {
    
    public double getArea(double base, double altura){
        
        double area = (base * altura) / 2;
        
        return area;
    }
    
    public double getPerimeter(double base, double altura){
        
        double sum = base;
        double hyp = Math.sqrt(Math.pow(base/2, 2) + Math.pow(altura, 2));
        
        System.out.println(hyp);
        
        return base + (2*hyp);
    }
}
