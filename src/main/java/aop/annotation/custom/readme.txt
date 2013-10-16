	
1.为什么 ，自定义annotation必须小写 ‘statistical’；大写@annotation(Statistical)，提示找不到
	
	<aop:config>
		<aop:aspect id="monitor" ref="aspectStatistical">
			<aop:around pointcut="@annotation(statistical)" method="incrOne" />
		</aop:aspect>
	</aop:config>