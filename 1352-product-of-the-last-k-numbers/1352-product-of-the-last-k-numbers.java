class ProductOfNumbers {
    ArrayList<Integer> arr = new ArrayList<>();
    int product=1;
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        if(num==0){
            arr=new ArrayList<>();
            product=1;
            return;
        }
        product*=num;
        arr.add(product);
       
    }
    
    public int getProduct(int k) {
        if(arr.size()<k){
            return 0;
        }
        int ans =arr.get(arr.size()-1);;
        if(arr.size()==k){
            return ans;
        }
        return ans / arr.get(arr.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */