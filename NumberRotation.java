public class NumberRotation {
            // Function to rotate a number to the right
            public static int rotateRight(int number, int places) {
                String numberStr = Integer.toString(number);
                int length = numberStr.length();
                int splitPoint = length - places;
                String rotatedNumberStr = numberStr.substring(splitPoint) + numberStr.substring(0, splitPoint);
                return Integer.parseInt(rotatedNumberStr);
            }

            // Function to rotate a number to the left
            public static int rotateLeft(int number, int places) {
                String numberStr = Integer.toString(number);
                int length = numberStr.length();
                int splitPoint = places % length;
                String rotatedNumberStr = numberStr.substring(splitPoint) + numberStr.substring(0, splitPoint);
                return Integer.parseInt(rotatedNumberStr);
            }

            public static void main(String[] args) {
                int originalNumber = 12345;
                int rotationPlaces = 2;

                // Rotate the number to the right 2 times
                int rotatedRightTwice = rotateRight(rotateRight(originalNumber, rotationPlaces), rotationPlaces);

                // Rotate the number to the left 2 times
                int rotatedLeftTwice = rotateLeft(rotateLeft(originalNumber, rotationPlaces), rotationPlaces);

                System.out.println("Original number: " + originalNumber);
                System.out.println("Rotated number to the right 2 times: " + rotatedRightTwice);
                System.out.println("Rotated number to the left 2 times: " + rotatedLeftTwice);
            }
        }

