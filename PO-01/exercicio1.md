## Exercício 1
Uma classe em Java é o que define um objeto. Nela contém as características (atributos) e os comportamentos (métodos) de um objeto instanciado da classe referida.

Exemplo de uma classe que define um objeto Carro em C++:
```
class Carro {
    private:
        string marca;
        string modelo;
        int ano;
    public:
        Carro(string marca, string modelo, int ano){
            this->marca = marca;
            this->modelo = marca;
            this-> ano = ano;
        }
        
        string getMarca(){
            return this->marca;
        }
        
        string getModelo(){
            return this->modelo;
        }
        
        int getAno(){
            return this->ano;
        }
        
        void setMarca(string marca){
            this->marca = marca;
        }
        
        void setModelo(string modelo){
            this->modelo = modelo;
        }
        
        void setAno(int ano){
            this->ano = ano;
        }
};
```
Exemplo de uma classe que define um objeto Carro em Java:
```
public class Carro{
    private String marca;
    private String modelo;
    private int ano;
    
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public Int getAno(){
        return this.ano;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
}
```
Exemplo de uma classe que define um objeto Usuario em C++:
```
class User {
    private:
        string username;
        string email;
        string password;
    public:
        Usuario(string username, string email, string password) {
            this->username = username;
            this->email = email;
            this->password = password;
        }
        
        string getUsername(){
            return this->username;
        }
        
        string getEmail(){
            return this->email;
        }
        
        string getPassword(){
            return this->password;
        }
        
        void setUsername(string username){
            this->username = username;
        }
        
        void setEmail(){
        }
};
```
Exemplo de uma classe que define uma objeto Usuario em Java:
```
public classe User {
    private String username;
    private String email;
    private String password;
    
    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this. password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getEmai(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    pubic void setEmail(String email){
        this.email = email;
    }
}
```
Exemplo de uma classe que define um objeto Produto em C++:
```
class Product {
    private:
        long int id;
        string name;
        double price;
    public:
        Product(long int id, string name, double price){
            this->id = id;
            this->name = name;
            this->price = price;
        }
        
        long int getId(){
            return this->id;
        }
        
        string getName(){
            return this->name;
        }
        
        string getPrice(){
            return this->price;
        }
        
        void setName(){
            this->name = name;
        }
        
        void setPrice(){
            this->price = price;
        }
};
```
Exemplo de uma classe que define um objeto Produto em Java:
```
public class Product {
    private Long id;
    private String name;
    private String price;
    
    public Product(Long id, String name, String price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public Long getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPrice(){
        return this.price;
    }
}
```
Exemplo de uma classe que define um objeto Pedido em C++:
```
class Pedido {
    private:
        long int id;
        long int id_cliente;
        vector<Produto> produtos;
    public:
        Pedido(long int id, long int id_cliente) {
            this->id = id;
            this->id_cliente = id_cliente;
        }
        
        void acrescentaProduto(Produto produto) {
            this->produtos.push_back(produto);
        }
        
        long int getId(){
            return this->id;
        }
        
        long int getId_cliente(){
            return this->id_cliente;
        }
        
        vector<Produto> getProdutos(){
            return this->produtos;
        }
}
```
Exemplo de uma classe que define um objeto Pedido em Java:
```
public class Pedido {
    private Long id;
    private Long id_cliente;
    List<Produto> produtos;
    
    public Pedido(Long id, Long id_cliente){
        this.id = id;
        this.id_cliente = id_cliente;
        this.produtos = new ArrayList<Produto>();
    }
    
    public void acrescentarProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public Long getId(){
        return this.id;
    }
    
    public Long get_id_cliente(){
        return this.id_cliente;
    }
    
    public List<Produto> getProdutos(){
        return this.produtos;
    }
}
```
Exemplo de uma classe que define um objeto calculadora em C++:
```
class CalculadoraSimples {
    public:
        static double somar(double x, double y){
            return x + y;
        }
        
        static double subtrair(double x, double y){
            return x - y;
        }
        
        static double multiplicar(double x, double y){
            return x * y;
        }
        
        static double dividir(double x, double y) {
            return x / y;
        }
};
```
Exemplo de uma classe que define um objeto calculadora em Java:
```
public class CalculadoraSimples {
    public static double somar(double x, double y){
        return x + y;
    }
    
    public static double subtrair(double x, double y){
        return x - y;
    }
    
    public static double multiplicar(double x, double y){
        return x * y;
    }
    
    public static double dividir(double x, double y){
        return x / y;
    }
}
```