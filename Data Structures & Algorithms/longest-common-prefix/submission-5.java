class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] ans=strs[0].toCharArray();
        for(int i=1;i<strs.length;i++)
        {
            char[] str=strs[i].toCharArray();
            for(int j=0;j<Math.min(ans.length,strs[i].length());j++)
            {
            if(ans[j]!=str[j])
            {
                ans[j]='0';
            }
            }
        }
        String answerStr="";
        for(char ch:ans)
        {
            if(ch=='0')
            {
                break;
            }else
            {
                answerStr+=ch;
            }
        }
        return answerStr;
    }
}