class StringApp{
    public boolean CheckSubString( String mainString, String subString){
        if (mainString.contains(subString)) {
            System.out.println("Chuoi con \"" + subString + "\" co trong chuoi chinh \"" + mainString + "\"");
            return true;
        } else {
            System.out.println("Chuoi con \"" + subString + "\" khong co trong chuoi chinh \"" + mainString + "\"");
            return false;
        }
    }
    public int CountCharInString(String mainString, char searchChar) {
        int count = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }
    public String UpperCaseToString(String mainString) {
        return mainString.toUpperCase();
    }
    public boolean isPalindrome(String mainString) {
        int n = mainString.length();
        for (int i = 0; i < n / 2; i++) {
            if (mainString.charAt(i) != mainString.charAt(n - i - 1)) {
                System.out.println("Chuoi: \"" + mainString + "\" khong phai la chuoi doi xung: ");
                return false;
            }
        }
        System.out.println("Chuoi: \"" + mainString + "\"  la chuoi doi xung ");
        return true;
    }
}
