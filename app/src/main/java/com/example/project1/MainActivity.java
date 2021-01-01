package com.example.project1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;



import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,
            btn_7,btn_8,btn_9,btn_clear,btn_percent,
            btn_log,btn_PandM, btn_squ2,btn_sin,
            btn_cos,btn_div,btn_mul,btn_fac,btn_pow,
            btn_sub,btn_add,btn_equ,btn_p;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_percent.setOnClickListener(this);

        btn_log = (Button) findViewById(R.id.btn_log);
        btn_log.setOnClickListener(this);

        btn_fac = (Button) findViewById(R.id.btn_fac);
        btn_fac.setOnClickListener(this);

        btn_pow = (Button) findViewById(R.id.btn_pow);
        btn_pow.setOnClickListener(this);

        btn_PandM = (Button) findViewById(R.id.btn_PandM);
        btn_PandM.setOnClickListener(this);

        btn_squ2 = (Button) findViewById(R.id.btn_squ2);
        btn_squ2.setOnClickListener(this);

        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener(this);

        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_cos.setOnClickListener(this);

        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);

        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);

        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        btn_equ = (Button) findViewById(R.id.btn_equ);
        btn_equ.setOnClickListener(this);

        btn_p = (Button) findViewById(R.id.btn_p);
        btn_p.setOnClickListener(this);

        text=(EditText) findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        String str = text.getText().toString();
        switch(v.getId()){
            case R.id.btn_percent:
                double tann=Double.parseDouble(str);
                tann=Math.toRadians(tann);
                tann=Math.tan(tann);
                String tann1=String.format("%.9f",tann);//规避极小误差
                tann1 = tann1.replaceAll("0+?$", "");//去掉多余的0
                tann1 = tann1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(tann1);
                break;
            case R.id.btn_clear:
                str="0";
                text.setText(str);
                break;
            case R.id.btn_0:
                if (str.equals("0")){
                    str="0";
                }
                else{
                    str+="0";
                }
                text.setText(str);
                break;
            case R.id.btn_1:
                if (str.equals("0")){
                    str="1";
                }
                else{
                    str+="1";
                }
                text.setText(str);
                break;
            case R.id.btn_2:
                if (str.equals("0")){
                    str="2";
                }
                else{
                    str+="2";
                }
                text.setText(str);
                break;
            case R.id.btn_3:
                if (str.equals("0")){
                    str="3";
                }
                else{
                    str+="3";
                }
                text.setText(str);
                break;
            case R.id.btn_4:
                if (str.equals("0")){
                    str="4";
                }
                else{
                    str+="4";
                }
                text.setText(str);
                break;
            case R.id.btn_5:
                if (str.equals("0")){
                    str="5";
                }
                else{
                    str+="5";
                }
                text.setText(str);
                break;
            case R.id.btn_6:
                if (str.equals("0")){
                    str="6";
                }
                else{
                    str+="6";
                }
                text.setText(str);
                break;
            case R.id.btn_7:
                if (str.equals("0")){
                    str="7";
                }
                else{
                    str+="7";
                }
                text.setText(str);
                break;
            case R.id.btn_8:
                if (str.equals("0")){
                    str="8";
                }
                else{
                    str+="8";
                }
                text.setText(str);
                break;
            case R.id.btn_9:
                if (str.equals("0")){
                    str="9";
                }
                else{
                    str+="9";
                }
                text.setText(str);
                break;
            case R.id.btn_p:        //加入浮点数运算
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+=".";
                    text.setText(str);
                }
                break;
            case R.id.btn_add:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="+";
                    text.setText(str);
                }
                break;
            case R.id.btn_sub:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "-";
                    text.setText(str);
                }
                break;
            case R.id.btn_mul:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "×";
                    text.setText(str);
                }
                break;
            case R.id.btn_div:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "÷";
                    text.setText(str);
                }
                break;
            case R.id.btn_equ:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'){
                    Toast.makeText(MainActivity.this,"Please complete the formula!",Toast.LENGTH_SHORT).show();         //检查表达式是否完整
                    text.setText(str);
                }
                else {
                    String re = getResult();
                    if (re.contains("Infinity")) {
                        Toast.makeText(MainActivity.this, "0 cannot be used as a divior!", Toast.LENGTH_SHORT).show();      //0不能作为除数
                        text.setText("0");
                    } else {
                        text.setText(re);
                    }
                }
                break;
            case R.id.btn_squ2:
                if(str.charAt(0)=='-'){
                    Toast.makeText(MainActivity.this,"Negative numbers cannot be squared!",Toast.LENGTH_SHORT).show();          //负数不能开平方
                    text.setText("0");
                }
                else if(str.contains("+")||str.contains("-")||str.contains("×")||str.contains("÷")){
                    Toast.makeText(MainActivity.this,"Symbols cannot be squared!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else{
                    double x=Double.parseDouble(str);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
            case R.id.btn_fac:
                int fac=Integer.parseInt(str);
                int res=1;
                if(str.charAt(0)=='-'){
                    Toast.makeText(MainActivity.this,"Negative numbers cannot be multiplied!",Toast.LENGTH_SHORT).show();
                }
                else {
                    while (fac > 0) {
                        res *= fac;
                        fac--;
                    }
                    String per1 = "" + res;
                    per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                    per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(per1);
                    break;
                }
            case R.id.btn_pow:
                double zhishu=Double.parseDouble(str);
                zhishu=Math.pow(10,zhishu);
                String con=""+zhishu;
                con = con.replaceAll("0+?$", "");//去掉多余的0
                con = con.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(con);
                break;
            case R.id.btn_log:
                double shu=Double.parseDouble(str);
                shu=Math.log10(shu);
                String result=""+shu;
                result = result.replaceAll("0+?$", "");//去掉多余的0
                result = result.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(result);
                break;
            case R.id.btn_sin:
                double sinn=Double.parseDouble(str);
                sinn=Math.toRadians(sinn);
                sinn=Math.sin(sinn);
                String sinn1=String.format("%.9f",sinn);//规避极小误差
                sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(sinn1);
                break;
            case R.id.btn_cos:
                double coss=Double.parseDouble(str);
                coss=Math.toRadians(coss);
                coss=Math.cos(coss);
                String coss1=String.format("%.9f",coss);//规避极小误差
                coss1 = coss1.replaceAll("0+?$", "");//去掉多余的0
                coss1 = coss1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(coss1);
                break;
            case R.id.btn_PandM:
                if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                    if(str.equals("0")){
                        text.setText("0");
                    }
                    else{
                        text.setText("-"+str);
                    }
                }
                else if(str.charAt(0)=='-')
                    text.setText(str.substring(1,str.length()));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }

    //将中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix){
        Stack<String> stack=new Stack<String>();   //运算符栈,顺序栈
        StringBuffer postfix=new StringBuffer(infix.length()*2);   //后缀表达式字符串
        int i=0;
        while(i<infix.length()){
            char ch=infix.charAt(i);
            switch(ch){
                case '+':
                    while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());   //且添加到后缀表达式串
                    stack.push(ch+""); //ch入栈
                    i++;
                    break;
                case '-':
                    if(i==0){
                        stack.push("(");
                        postfix.append(0);
                        postfix.append(" ");
                        stack.push(ch+""); //ch入栈
                        i++;
                    }else {
                        while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                            postfix.append(stack.pop());   //且添加到后缀表达式串
                        stack.push(ch+""); //ch入栈
                        i++;
                    }
                    break;
                case '×':
                case '÷':
                    while(!stack.isEmpty()&&(stack.peek().equals("×")||stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++;
                    break;

                default:
                    if(i==1&&infix.charAt(0)=='-'){
                        while((i<infix.length()&&ch>='0'&&ch<='9')||(i<infix.length()&&ch=='.')){
                            postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                            i++;
                            if(i<infix.length())
                                ch=infix.charAt(i);
                        }
                        postfix.append(" ");
                        stack.pop();
                        postfix.append('-');
                        stack.pop();

                    }
                    else {
                        while ((i < infix.length() && ch >= '0' && ch <= '9') || (i < infix.length() && ch == '.')) {
                            postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                            i++;
                            if (i < infix.length())
                                ch = infix.charAt(i);
                        }
                        postfix.append(" ");
                    }
            }

        }
        while(!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());   //添加到后缀表达式中
        return postfix;
    }

    //计算后缀表达式
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new Stack<Double>();   //操作数栈,链式栈
        double value=0;
        int j=0;
        for(int i=0;i<postfix.length();i++){
            j=i;
            char ch=postfix.charAt(i);
            if ((ch>='0'&&ch<='9')||ch=='.') {
                value=0;
                while(ch!=' '){
                    while(ch!=' '&&ch!='.'){
                        value=value*10+ch-'0';
                        j++;
                        ch=postfix.charAt(++i);
                    }
                    if(ch!=' '&&ch=='.')
                        ch=postfix.charAt(++i);
                    while(ch!=' '&&(i>=j+1)){
                        BigDecimal valueBD=new BigDecimal(Double.toString(value));
                        BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                        BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                        double temp=chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                        value=valueBD.add(tempBD).doubleValue();
                        ch=postfix.charAt(++i);
                    }

                    stack.push(value);
                }

            }
            else{
                if(ch!=' '){
                    Double y=stack.pop();
                    Double x=stack.pop();
                    switch(ch){
                        case'+':
                            value=x+y;
                            break;
                        case'-':
                            value=x-y;
                            break;
                        case'×':
                            value=x*y;
                            break;
                        case'÷':
                            value=x/y;
                            break;
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }
    public String getResult(){
        String infix = text.getText().toString();
        StringBuffer postfix=toPostfix(infix);
        Double result=toValue(postfix);
        String re=String.format("%.7f",result);//规避极小误差
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }

}
