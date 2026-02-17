class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;

        for (int i = 0; i < fruits.length; i++) {
            boolean placed = false;

            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i] <= baskets[j]) {
                    placed = true;
                    baskets[j] = 0; // basket used
                    break;
                }
            }

            if (!placed) {
                unplaced++;
            }
        }

        return unplaced;
    }
}
