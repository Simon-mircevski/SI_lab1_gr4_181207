class Point {
        String color
	String id
	double x,y;
        Point(double x, double y){
            this.x=x;
            this.y=y;
        }
        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
        public void setX(new_x){
            this.x=new_x;
        }
        public void setY(new_y){
            this.y=new_y;
        }
        
	//TODO add new variable

	//TODO constructor

	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		//TODO
            bool x_axis=false, y_axis=false;
            if(xDirection == 'L'){
                x--;
            }
            else if(xDirection == 'R'){
                x++;
            }
            else if(yDirection == 'U'){
                y--;
            }
            else if(yDirection == 'D'){
                y++;
            }
            
	}

	public void draw () {
		//TODO
            return x + " " + y;
	}



}