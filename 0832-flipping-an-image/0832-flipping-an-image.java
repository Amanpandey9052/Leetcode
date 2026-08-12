class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){

            int right=0;
            int left=image[i].length-1;

            while(right<=left){
                int temp=image[i][right];
                image[i][right]=1-image[i][left];
                image[i][left]=1-temp;
                right++;
                left--;
            }
        }
        return image;
    }
}

