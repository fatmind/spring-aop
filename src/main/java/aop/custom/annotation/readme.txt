

1. 无论 <aop> 或  aspect annotation，其在以下几个方面是一致的 ：

- pointcut 定义的规则， 参考：6.2.3. 声明一个切入点（pointcut）
- 获取参数的方式，参考：6.2.4.6. 通知参数（Advice parameters）


2. 如何选择 ？
参考：6.4.2. Spring AOP中使用@AspectJ还是XML

建议更倾向于aspect ：
- aspect具有将切面保持为一个模块单元
- xml仅仅支持"singleton"切面实例模型， 并且不能在XML中组合命名连接点的声明

