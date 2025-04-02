## **Desafio Backend Itaú - API de Transações**  

> 🔗 **Baseado no projeto original:** [feltex/desafio-itau-backend](https://github.com/feltex/desafio-itau-backend)

### 🏦 Contexto  
Desenvolver uma **API RESTful** para processamento de transações financeiras em tempo real, seguindo rigorosamente as especificações técnicas do desafio Itaú.  

### 🎯 Objetivos Principais  
1. **Processamento Eficiente**  
   - Receber e validar transações com baixa latência  
   - Calcular estatísticas em tempo real (últimos 60 segundos)  

2. **Conformidade Técnica**  
   - Implementar os 3 endpoints exatamente como especificado:  
     - `POST /transacao`  
     - `GET /estatistica`  
     - `DELETE /transacao`  
   - Seguir todas as restrições de armazenamento (memória apenas)  

3. **Excelência de Código**  
   - Arquitetura limpa e organizada  
   - Tratamento robusto de erros  
   - Documentação clara  

### ⚙️ Requisitos-Chave  
    ```json

  {
    "stack": "Java/Kotlin + Spring Boot",
    "banco_de_dados": "Proibido (armazenar em memória)",
    "formato": "Apenas JSON",
    "timeout_cálculo": "≤ 100ms"
  }

---

## 🛠️ Tecnologias Utilizadas

### 📌 Stack Principal
| Componente       | Tecnologia             | Versão  | Finalidade                          |
|------------------|------------------------|---------|-------------------------------------|
| Linguagem        | **Java**               | 17      | Lógica de negócio e endpoints       |
| Framework        | **Spring Boot**        | 3.4.3   | Injeção de dependências e REST API  |
| Build Tool       | **Maven**              | 4.0.0   | Gerenciamento de dependências       |

### 🔄 Gerenciamento de Dados
| Técnica          | Implementação          | Motivo                              |
|------------------|------------------------|-------------------------------------|
| Armazenamento    | `ConcurrentHashMap`    | Thread-safe para acesso concorrente  |
| Limpeza          | `ScheduledExecutorService` | Remoção automática de transações expiradas |

## 🚀 Funcionalidades Principais

### 1. **Processamento de Transações**  
✅ Valida e armazena transações em memória  
- Checa valor não-negativo e data válida (ISO 8601)  
- Rejeita transações futuras ou inválidas (HTTP 422)  

### 2. **Estatísticas em Tempo Real**  
📊 Calcula automaticamente (últimos 60s):  
- `count`, `sum`, `avg`, `min`, `max`  
- Resposta instantânea (<100ms)  

### 3. **Gestão de Dados**  
🧹 Endpoint `DELETE /transacao` para reset total  

## 🚀 Como Executar

### Pré-requisitos
- Java 17+
- Maven  4.0+
- Git

### Passo a Passo
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/KaiqueBorgesdeOliveira/desafio_itau_kaique
   cd desafio_itau_kaique

## 🌟 Considerações Finais

Este projeto demonstra a aplicação de **boas práticas de desenvolvimento** em um cenário com restrições técnicas específicas. A arquitetura proposta oferece:

- ✅ **Simplicidade**: Solução enxuta e focada no essencial  
- ⚡ **Performance**: Respostas em milissegundos  
- 🔒 **Confiabilidade**: Validações robustas e thread-safe  

```java
// Exemplo do cerne da solução
@RestController
public class TransacaoController {
    @PostMapping("/transacao")
    public ResponseEntity<Void> criarTransacao(@Valid @RequestBody Transacao transacao) {
        // Lógica concisa e eficiente
    }
}
