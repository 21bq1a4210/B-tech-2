class Demo{
    public static void main(String[] args) {
        int []a={3, 20, 17, 19, 25, 35, 9, 42, 16, 27};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("sorted array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
};