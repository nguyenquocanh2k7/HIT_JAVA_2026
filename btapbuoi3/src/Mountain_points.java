public class Mountain_points {
    private int[] arr;
    public Mountain_points(int[] arr){
    this.arr=arr;
    }
    public int countMountain(){
        int index = 0;
        int count = 0;
        for (int number : arr) {
            if (index > 0 && index < arr.length - 1) {
                if (number > arr[index - 1] && number > arr[index + 1])
                    count++;
            }
            index++;
        }
        return count;

    }
}

