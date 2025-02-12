class Solution {
    public int evalRPN(String[] tokens) {
        
        int returnValue  = 0;
        Stack<String> st  = new Stack<String>();

        String operators = "+-/*";

        for(String t  : tokens)
        {
            if(!operators.contains(t))
            {
                st.push(t);
            }
            else
            {
                int a  = Integer.valueOf(st.pop());
                int b  = Integer.valueOf(st.pop());

                switch(t)
                {
                   case "+" :
                   st.push(String.valueOf(a + b));
                   break;

                   case "-":
                   st.push(String.valueOf(b-a));
                   break;

                   case "*":
                   st.push(String.valueOf(a*b));
                   break;

                   case "/":
                   st.push(String.valueOf(b / a));
                   break;
                }

            }
        }

        returnValue  = Integer.valueOf(st.pop());
        return returnValue;

    }
}