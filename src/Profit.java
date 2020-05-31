public class Profit {

    public int minimum(int[] arr, int start){
        int small = arr[0];
        int minIndex = start;
        for(int i = start + 1; i < arr.length; i++){
            if(arr[i] < small && arr[i] != 0){
                minIndex = i;
                small = arr[i];
            }
        }
        return (small > 0)? minIndex : 0;
    }

    public int maximum(int[] arr, int start){
        if(start == arr.length-1)
            return -1;
        int maximum = arr[start+1];
        for(int i = start+2; i < arr.length; i++){
            if(maximum < arr[i])
                maximum = arr[i];
        }
        return maximum;
    }

    public int profit(int buy, int sell){
        if(sell == -1)
            return 0;
        return sell - buy;
    }
}
