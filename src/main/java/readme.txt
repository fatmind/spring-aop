1.spring aop 参数传递

a、<aop:before  method="bindMethodArgTest" arg-names="argvalue" 
	pointcut="execution( * com.spring.ch4.*.showValues(..)) and args(argvalue)" />

b、<aop:pointcut id="pointcut" expression="execution(* *.perform(..))"/>

A正确，B失败

思考：spring角度，定义pointcut是为了抽象    