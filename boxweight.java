public class boxweight extends box {

    double weight;

    boxweight(){
        this.weight=1;
    }

    boxweight(double l, double w, double h, double weig) {
        super(l, w, h);
       this.weight = weig;
    }

    public static void main(String[] args) {
        boxweight boxx1 = new boxweight(5,4,1,2);
        System.out.print(boxx1.weight + " " + boxx1.l);
    }

}
