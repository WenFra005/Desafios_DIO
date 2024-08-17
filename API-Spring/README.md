# API hospitalar
Código feito para o cumprimento do desafio DIO de fazer um API próprio. Esse código faz o cadastro de usuário que podem ser **pacientes** ou **médicos**, agenda consultas, mostra notícias do hospital e gerencia dados informações pessoais hospitalares e profissionais.

## ❗ATENÇÃO
Os dados contidos no código são fictícios. Usei o **Faker** para isso.

## Diagrama de classes

````mermaid

classDiagram
    class Usuario {
        Long id
        DadosPessoais dadosPessoais
        DadosHospitalares dadosHospitalares
        DadosProfissionais dadosProfissionais
        List~Noticia~ noticias
    }

    class DadosPessoais {
        Long id
        String nome
        String cpf
        String dataNascimento
        String sexo
        Endereco endereco
        Contato contato
    }

    class Endereco {
        Long id
        String rua
        int numero
        String cidade
        String estado
    }

    class Contato {
        Long id
        String telefone
        String email
    }

    class DadosHospitalares {
        Long id
        String numeroRegistroHospital
        String dataAdmissao
        String dataAlta
        String historicoMedico
    }

    class DadosProfissionais {
        Long id
        String numeroRegistroProfissional
        String funcao
        String especialidade
    }

    class Noticia {
        Long id
        String titulo
        String conteudo
        String dataPublicacao
    }

    Usuario --> "1" DadosPessoais : possui
    Usuario --> "1" DadosHospitalares : possui
    Usuario --> "1" DadosProfissionais : possui
    Usuario --> "0..*" Noticia : publica
    DadosPessoais --> "1" Endereco : possui
    DadosPessoais --> "1" Contato : possui
