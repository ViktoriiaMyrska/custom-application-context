HOMEWORK #15 Custom Application Context

1. Create an interface ApplicationContext with the following API
  getBean(Class<T> beanType) – returns a bean by its type,
    it should throw NoSuchBeanException if nothing is found
    it should throw NoUniqueBeanException if more than one bean is found
  getBean(String name, Class<T> beanType) – returns a bean by its name
    it should throw NoSuchBeanException if nothing is found
  getAllBeans(Class<T> beanType) – returns a map of beans where the key is it’s name and the value is the bean

2.Create a custom annotation (like @Bean )

3.Create an implementation of the ApplicationContext that accepts a package name as a constructor parameter
  Scan the package to find all classes annotated with @Bean
  Create instances of those classes
  Resolve a name for each bean
  If annotation has name like this @Bean("coolBean") – use "coolBean"
  Otherwise, use class name with the lowercased first letter. E.g. for PrinterService class – use "printerService"
  Store created object by its name in the application context
