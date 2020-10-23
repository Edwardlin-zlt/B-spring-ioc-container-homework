# 主观题：@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

因为Component虽然已经可以实现**bean管理**和**自动装配**，但是需要在类源码上写上`Annotation`. 

如果是引入其他类（别人写好的类）无法在其源码上加上`@Component`，这时为了实现让框架管理`Bean`并**自动装备**，就需要用`@Bean`了。
