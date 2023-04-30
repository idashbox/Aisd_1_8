import java.util.Scanner;

public class Triangle {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    public double getX1(){
        return x1;
    }
    public double getY1(){
        return y1;
    }
    public double getX2(){
        return x2;
    }
    public double getY2(){
        return y2;
    }
    public double getX3(){
        return x3;
    }
    public double getY3(){
        return y3;
    }
    public void setX1(double x){
        this.x1 = x;
    }
    public void setY1(double y){
        this.y1 = y;
    }
    public void setX2(double x){
        this.x2 = x;
    }
    public void setY2(double y){
        this.y2 = y;
    }
    public void setX3(double x){
        this.x3 = x;
    }
    public void setY3(double y){
        this.y3 = y;
    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }
    public double getR(){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)) + Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2)) + Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
    }
    public double getS(){
        return 0.5*(x1-x3)*(y2-y3)-(x2-x3)*(y1-y3);
    }
    public void isInTriangle(double x, double y){
        if(((x-x1)*(y1-y2)-(y-y1)*(x1-x2)>=0) && ((x-x2)*(y2-y3)-(y-y2)*(x2-x3)>=0) &&((x-x3)*(y3-y1)-(y-y3)*(x3-x1)>=0)){
            System.out.printf("Точка (%s, %s) принадлежит заданному треугольку", x, y);
            System.out.println();
        }else{
            System.out.printf("Точка (%s, %s) не принадлежит заданному треугольку", x, y);
            System.out.println();
        }
    }
    public static void newTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Приветствую! Давайте создадим новый тругольник!");
        System.out.println("Давайте зададим координаты его вершин.");
        System.out.println("Координата X1 будет равна: ");
        double x1 = sc.nextDouble();
        System.out.println("Координата Y1 будет равна: ");
        double y1 = sc.nextDouble();
        System.out.println("Координата X2 будет равна: ");
        double x2 = sc.nextDouble();
        System.out.println("Координата Y2 будет равна: ");
        double y2 = sc.nextDouble();
        System.out.println("Координата X3 будет равна: ");
        double x3 = sc.nextDouble();
        System.out.println("Координата Y3 будет равна: ");
        double y3 = sc.nextDouble();
        Triangle tr = new Triangle(x1,y1,x2,y2,x3,y3);
        System.out.println("Отлично! Треугольник создан! Если хотите узнать его площадь, напишите 1, периметр - 2, принадлежность точки - 3, иначе 0");
        while (sc.hasNext()){
            int a = sc.nextInt();
            if (a == 1){
                System.out.println("Площадь трегольника равен " + tr.getS());
                System.out.println("Найти или проверить что-то ещё?");
            }
            if (a == 2) {
                System.out.println("Периметр трегольника равен " + tr.getR());
                System.out.println("Найти или проверить что-то ещё?");
            }
            if (a == 3){
                System.out.println("Введите координату X0: ");
                double x0 = sc.nextDouble();
                System.out.println("Введите координату Y0: ");
                double y0 = sc.nextDouble();
                tr.isInTriangle(x0,y0);
                System.out.println("Найти или проверить что-то ещё?");
            }
            if (a == 0){
                System.out.println("Хорошо! Всего доброго!");
                break;
            }
            if (a != 1 && a != 2 && a != 3){
                System.out.println("Напишите командное число");
            }
        }
    }
}
