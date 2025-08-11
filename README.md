# Sistema de Cadastro de Colonos

## Sobre o Sistema

Este é um projeto de aprendizagem do Java com o Swing, demonstrando uma interface gráfica (GUI) para cadastrar informações de usuários (colonos). O sistema coleta dados como nome, e-mail, idade e gênero, e exibe estas informações em uma janela (*JOptionPane*).

## Funcionalidades
* **Formulário de Cadastro:** Uma janela com campos para o usuário inserir seus dados.
* **Validação de E-mail:** O sistema utiliza Expressão Regular (Regex) para garantir que o e-mail inserido siga um formato válido e tenha um domínio reconhecido (como *@gmail.com*, *@outlook.com.br*, etc.).
* **Seleção de Gênero:** Utiliza *JRadioButtons* para selecionar o gênero (Masculino, Feminino ou Outro).

* **Campo "Outro" Dinâmico:** O campo de texto para inserir um gênero personalizado só é habilitado quando a opção "Outro" é selecionada.

* **Botão Cadastrar:** Após a validação, exibe os dados do usuário em um *JOptionPane*.

* **Botão Limpar:** Limpa todos os campos do formulário para um novo cadastro.

* **Tratamento de Dados:** Garante que todos os campos obrigatórios estejam preenchidos antes de permitir o cadastro.

## Como Executar

Para rodar este projeto, é necessário ter o **Java Development Kit (JDK)** instalado na sua máquina.

**1. Clone o repositório:** (Se estiver em um repositório Git)
git clone https://github.com/PEDROisaias/PedroIsaias_APISwingJava.git

**2. Compile o código Java:** Abra o terminal na pasta onde o arquivo *CadastroColono.java* está localizado e execute o seguinte comando:
*javac CadastroColono.java*

**3. Execute o programa:**
*java CadastroColono*
Uma janela de formulário será exibida, pronhta para ser usada.

## **Tecnologias Utilizadas**
* **Java**
* **Java Swing:** Biblioteca para a construção da interface gráfica.
* **java.util.regex:** API para trabalhar com expressões regulares.

## **Detalhes da Implementação**

* A interface foi construída usando o *FlowLayout,* que organiza os componentes em uma linha.

* O *ButtonGroup* é usado para agrupar os *JRadioButtons*, permitindo que apenas um possa ser selecionado por vez.

* A validação de e-mail é feita por uma regex específica, que verifica a estrutura do e-mail e restringe os domínios para *gmail*, *hotmail*, *outlook*, *yahoo* e *live*.

* A lógica de validação de campos vazios e de e-mail está dentro do *ActionListener* do botão "Cadastrar".

## **Autor**

* **Pedro Isaías** - [Acesse meu perfil](https://github.com/PEDROisaias)