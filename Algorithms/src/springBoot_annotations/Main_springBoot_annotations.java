package springBoot_annotations;

public class Main_springBoot_annotations {

    /** @Required */
    /* application : bean definition methods
    *  indicates that the affected bean must be filled otherwise an exception will be raised BeanInitializationException
    */

    /** Autowired */
    /* Application : variables, methods, constructors
    *  Objective : Object dependence injection
    *  From Spring 4.3 @Autowired is now not mandatory
    */

    /** @Qualificatif */
    /* Application : this annotation is used with @Autowired
    * spring will now which bean must be used and injected
    */

    /** @Configuration @ComponentScan @Bean */
    /* Configuration : allows Spring to know the packages to analyze -> will have methods to instantiate and dependence configuration
    * Bean : Used to create beans spring -> the methods before will be annotated with @Bean
    */

    /** @Component @Controller @Service @Repository */
    /* component : used to indicate if a class in spring component -> marked as a bean
    * Controller : it's a spring controller
    * Service : for a class which has certain service treatments like functional logical execution
    * repository : for java classes which has a direct access to the DB
    */

    /** @EnableAutoConfiguration @SpringBootApplication */
    /* EnableAutoConfiguration : used in the main application class
    * SpringBootApplication : used in the man application class to configure a Spring boot project
    */

    /** @Controller @RequestMapping @CookieValue @CrossOrigin */
    /* Controller : used for classes which are having a controller role
    * RequestMapping : to map the web requests on classes or methods ->
    * on a class we will create an URI & on a method we need to provide a HTTP method value
    * CookieValue : used with RequestMapping @RequestMapping("/cookieValue") & public void getCookieValue(@CookieValue "JSESSIONID" String cookie)
    * CrossOrigin : to activate the communication between a the front-end and the back-end for a sharing resources
     */

    /** @GetMapping @PostMapping @PutMapping @PatchMapping @DeleteMapping @ExceptionHandler @InitBinder */
    /* GetMapping PostMapping PutMapping PatchMapping DeleteMapping for HTTP get, post, put, patch, delete requests recursively
    * Exception Handler used on methods which will be called to catch an exception
    * InitMapping to identify the methods that initialize theWebDataBinder
     */

    /** Spring cloud */
    /** @EnableConfigServer @EnableEurekaServer @EnableDiscoveryClient @EnableCircuitBreaker @HystrixCommand*/
    /*
    *
     */

    /** @Transactional */
    /* to be added on an interface / on a class / on a public method
    *
    */
}
