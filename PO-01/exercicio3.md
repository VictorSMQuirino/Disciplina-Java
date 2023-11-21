## Exercício 3

Herança é um dos pilares da orientação a objetos. Esse conceito indica que uma classe pode herdar características (atributos) e comportamentos (métodos) de outra classe.
Segue 5 exemplos de classes que utilizam herança, tanto em C++ como em Java:
```
//Em C++

class Veiculo {
    atributos e métodos...
};

class Carro : public Veiculo {
    atributos e métodos...
};

class FormaGeometrica {
    atributos e métodos...
};

class Circulo : public FormaGeometrica {
    atributos e métodos...
};

class Animal {
    atributos e métodos...
};

class Cachorro : public Animal {
    atributos e métodos...
};

class Pessoa {
    atributos e métodos...
};

class Cliente : public Pessoa {
    atributos e métodos...
};

class Usuario {
    atributos e métodos...
};

class Colaborador : public Usuario {
    atributos e métodos...
};

//Em Java

public class Veiculo {
    atributos e métodos...
}

public class Carro extends Veiculo {
    atributos e métodos...
}

public class FormaGeometrica {
    atributos e métodos...
}

public class Circulo extends FormaGeometrica {
    atributos e métodos...
}

public class Animal {
    atributos e métodos...
}

public class Cachorro extends Animal {
    atributos e métodos...
}

public class Pessoa {
    atributos e métodos...
}

public class Cliente extends Pessoa {
    atributos e métodos...
}

public class Usuario {
    atributos e métodos...
}

public class Colaborador extends Usuario {
    atributos e métodos...
}
```