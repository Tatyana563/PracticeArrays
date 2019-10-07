abstract class Figure {

        public abstract float getPerimeter();
        public abstract float getArea();
        public String figureName;

        public Figure(String figureName) {
            this.figureName = figureName;
        }
    }


    class Rectangular extends Figure {
        private float width;
        private float height;

        public Rectangular(float width, float height, String figureName) {
            super(figureName);
            this.width = width;
            this.height = height;

        }

        public float getPerimeter(){
            float result=0;
            result= 2*width+2*height;
            System.out.println("Perimeter of the rectangular:"+result);
            return result;
        }
        public  float getArea(){
            float result=0;
            result=width*height;
            System.out.println("Area of the rectangular:"+result);
            return result;
        }

        public static void main(String[] args) {
            Rectangular rect1 = new Rectangular(2, 3, "RectangulaR");
            rect1.getArea();
            rect1.getPerimeter();



        }
    }
    class Circle extends Figure {
        private float radius;

        public Circle(String figureName, float radius) {
            super(figureName);
            this.radius = radius;
        }

        @Override
        public float getPerimeter() {
            float result=0;
            result=(float)(2*Math.PI*radius);
            System.out.println("Length of the circle:"+result);
            return result;
        }

        @Override
        public float getArea() {
            float result=0;
            result=(float)(Math.PI*Math.sqrt(radius));
            System.out.println("Area of the Circle:"+result);
            return result;
        }
    }

