public PerformOperation isOdd() {
        return n -> n % 2 != 0;
   }

   public PerformOperation isPrime() {
        return n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
   }

   public PerformOperation isPalindrome() {
        return n -> {
            String s = Integer.toString(n);
            return s.equals(new StringBuilder(s).reverse().toString());
        };
   }
}