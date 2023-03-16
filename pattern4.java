class pattern4 {
    public static void main(String[] args) {
        int row =4;
        int col = 5;
        for(int i=1;i<=row;i++){
            for(int j=i;j<=col-1;j++){
                System.out.print("%");
            }
            System.out.println();
        }
    }
}
