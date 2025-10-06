# 🌐 Protocol Router System

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://java.com)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Architecture](https://img.shields.io/badge/Architecture-MVC-orange.svg)](https://en.wikipedia.org/wiki/Model–view–controller)
[![Status](https://img.shields.io/badge/Status-Complete-brightgreen.svg)](https://github.com/GabrielGit10110/ProtocolRouterSystem)

Um sistema de roteamento de protocolos implementado em Java seguindo o padrão MVC, com estruturas de dados customizadas para gerenciamento eficiente de múltiplos protocolos e filas de dados.

## 🏗️ Arquitetura do Sistema

### **MVC (Model-View-Controller)**
```
📁 Model (model.estrutura)
├── 📄 Router.java          # Gerenciador principal de protocolos
├── 📄 ProtocolList.java    # Lista de protocolos
├── 📄 Protocol.java        # Nó de protocolo com fila FIFO
├── 📄 DataList.java        # Fila FIFO para dados
└── 📄 Data.java            # Nó de dados

🎮 Controller (controller)
└── 📄 TestProtocols.java   # Suite de testes automatizados

📊 View (view)
└── 📄 Router.java          # Ponto de entrada da aplicação
```

## 🚀 Funcionalidades

### **🎯 Gerenciamento de Protocolos**
- ✅ **Criação automática** de protocolos sob demanda
- ✅ **Remoção inteligente** quando filas ficam vazias
- ✅ **Isolamento completo** entre diferentes protocolos
- ✅ **Busca eficiente** por tipo de protocolo

### **📊 Sistema FIFO Avançado**
- ✅ **Filas independentes** para cada protocolo
- ✅ **Comportamento FIFO** estrito (First-In-First-Out)
- ✅ **Auto-limpeza** de recursos
- ✅ **Gerenciamento de memória** eficiente

### **🛡️ Tratamento de Erros**
- ✅ **Exceções específicas** para casos de erro
- ✅ **Mensagens claras** em português
- ✅ **Recuperação graciosa** de falhas
- ✅ **Validação de entrada** robusta

## 💻 Tecnologias e Padrões

- **Java 17** - Linguagem principal
- **Estruturas de Dados Customizadas** - Linked Lists, Filas FIFO
- **Padrão MVC** - Separação de concerns
- **Javadoc** - Documentação profissional
- **Tratamento de Exceções** - Código resiliente

## 📦 Estrutura do Projeto

```
ProtocolRouterSystem/
├── 📁 src/
│   ├── 📁 model/estrutura/
│   │   ├── Router.java          # Gerenciador principal
│   │   ├── ProtocolList.java    # Lista encadeada de protocolos
│   │   ├── Protocol.java        # Nó com fila FIFO embutida
│   │   ├── DataList.java        # Implementação FIFO
│   │   └── Data.java            # Nó de dados
│   ├── 📁 controller/
│   │   └── TestProtocols.java   # Controlador de testes
│   └── 📁 view/
│       └── Router.java          # View principal
├── 📄 README.md
├── 📄 LICENSE
└── 📁 docs/                     # Documentação Javadoc
```

## 🎯 Casos de Uso

### **Rede de Computadores**
```java
Router router = new Router();
router.addData("HTTP", "GET /index.html");
router.addData("FTP", "DOWNLOAD file.zip");
router.addData("SMTP", "EMAIL user@domain.com");
```

### **Sistemas de Mensagens**
```java
// Diferentes tipos de mensagem em filas separadas
router.addData("ALERT", "System overload");
router.addData("LOG", "User login successful");
router.addData("METRIC", "CPU Usage: 45%");
```

### **Processamento de Dados**
```java
// Processamento batch com múltiplas filas
router.addData("PROCESSING", "Data chunk #1");
router.addData("VALIDATION", "Check integrity");
router.addData("OUTPUT", "Export results");
```

## 🧪 Testes e Exemplos

### **Executar Suite de Testes**
```java
public static void main(String[] args) {
    TestProtocols test = new TestProtocols();
    test.beginTest(); // Executa cenário completo
}
```

### **Saída Esperada dos Testes**
```
OLA_MUNDO
PRIMEIRO_EMAIL
ADEUS_MUNDO
SITE_INSEGURO
ULTIMO_EMAIL
Nada para ler, excluindo o protocolo...
Nada para ler, excluindo o protocolo...
Nada para ler, excluindo o protocolo...
Protocolo nao existe no sistema...
```

## 🚀 Como Executar

### **Compilação Manual**
```bash
# Compilar todo o projeto
javac -cp . view/Router.java controller/TestProtocols.java model/estrutura/*.java

# Executar
java view.Router
```

### **Com Maven**
```bash
mvn compile
mvn exec:java -Dexec.mainClass="view.Router"
```

## 📚 Documentação

### **🔗 [Documentação Online](https://gabrielgit10110.github.io/ProtocolRouterSystem/)**
Documentação completa hospedada no GitHub Pages.

## 🎯 Características Técnicas

### **Performance**
- **Inserção**: O(1) para novos dados
- **Busca**: O(n) para protocolos (otimizável)
- **Memória**: Alocação dinâmica eficiente
- **Concorrência**: Estruturas thread-safe (potencial)

### **Design Patterns**
- **MVC** - Separação de responsabilidades
- **Factory** - Criação de protocolos
- **Iterator** - Travessia de listas
- **Observer** - Notificações de estado

## 🤝 Contribuindo

1. **Fork** o projeto
2. Crie uma **branch** para sua feature (`git checkout -b feature/AmazingFeature`)
3. **Commit** suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. **Push** para a branch (`git push origin feature/AmazingFeature`)
5. Abra um **Pull Request**

## 📝 Licença

Distribuído sob licença MIT. Veja `LICENSE` para mais informações.

## 👨‍💻 Autor

**Gabriel** - [GabrielGit10110](https://github.com/GabrielGit10110)

- GitHub: [@GabrielGit10110](https://github.com/GabrielGit10110)

## 🌟 Agradecimentos

- Inspirado nas minhas aulas de estruturas de dados da faculdade
- Comunidade Java por boas práticas

---

**⭐ Se este projeto foi útil, não esqueça de dar uma estrela no repositório!**

---

<div align="center">

Feito com ❤️ e ☕ por Gabriel

[⬆ Voltar ao topo](#-protocol-router-system)

</div>
