package Exercices.Ex32_WallAreaComputation;

public class Wall {
    
    private double width;
    private double height;

    public double getArea() {
        return width * height;
    }

    public Wall() {

        if (width < 0) {
            setWidth(0);     
        }

        if (height < 0) {
            setHeight(0);     
        }

    }

    public Wall(double width, double height) {
        
        if (width < 0 ) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        
    }   

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0 ) {
            this.width = 0;
        } else {
            this.width = width;
        }
        
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        
    }
  
}
