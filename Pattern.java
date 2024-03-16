class Pattern {
    public static void main(String[] args) {
        // 1. Solid rectangle
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 2. Hollow rectangle
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if((i==1 || i==2) && (j==1 || j==2 || j==3) ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // Hollow rectangle 2
        int n=5;
        int m=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // 3. Half pyramid (left)
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 4. Half pyramid(right)
        // Condition:- n should be equal or more than m
        int flag = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(flag<=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            flag--;
            System.out.println();
        }
        System.out.println();
        
        // 5. inverted half pyramid(left)
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 5. inverted half pyramid(right)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // 6. Digit pattern
        //1
        //12
        //123
        //1234
        //12345
        
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

        // 7. inverted digit pattern
        //12345
        //1234
        //123
        //12
        //1

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<n){
                   System.out.print(j+1); 
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                   System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();

        // 8. Floyed's Trangle

        int number = 1;
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        System.out.println();

        // Home work problem 1 (Rhombus)
        int nn = 5;
        int mm = 10;

        for(int i=0;i<nn;i++){
            for(int j=0;j<mm-i;j++){
                if(j<(nn-i-1))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Home work problem 2
        n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=(n-i-1))
                    System.out.print(i+1+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        // Home work problem 3
        n=5;
        for(int i=0;i<n;i++){
            for(int j=n;j>=0;j--){
                if(j<=i)
                    System.out.print(j+1);
                else
                    System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(k+2);
            }
            System.out.println();
        }
        System.out.println();

        // Butterfly Pattern

        n = 4;
        m = 8;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<=i || j>=m-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<n-i || j>n+i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        // Diamond Pattern
        n = 4;

        // upper part
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=n-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                if(j<=i)
                    System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Print a hollow Butterfly

        n = 5;
        m = 10;
        // upper part
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==i || j==m-1 || j==0 || j==m-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // lower part
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==m-1 || j==0 || j==n-i-1 || j==n+i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        // Print a hollow Rhombus.

        n = 5;
        m = 9;

        for(int i=0;i<n;i++){
            for(int j=0;j<9-i;j++){
                if((j>n-i-1 && i==0) || (j==n-i-1 || j==m-i-1 || i==n-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        // Print Pascal’s Triangle
        n = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=n-i-1){
                    if(j==n-i-1 || j==n-1)
                        System.out.print(1+" ");
                    else if(i==n-1 && j==n/2)
                        System.out.print(i+2+" ");
                    else
                        System.out.print(i+" ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}