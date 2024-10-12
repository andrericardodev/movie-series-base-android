# MovieSeries Base
Repositório com informações de filmes e séries para dispositivos móveis **Android**.

## Informações técnicas

### Arquitetura
Este projeto adota três principais abordagens arquiteturais para garantir qualidade, escalabilidade e facilidade de manutenção:

**1. MVVM (Model-View-ViewModel):** Esse padrão facilita a separação das responsabilidades entre a interface de usuário (View), a lógica de exibição (ViewModel) e os dados (Model).

**2. Clean Architecture:** O projeto segue os princípios da Clean Architecture para manter o código modular e independente de frameworks, tornando-o mais fácil de escalar e manter. As dependências fluem sempre de fora para dentro, assegurando que as camadas internas sejam isoladas de mudanças nas camadas externas.

**3. Princípios SOLID:** Todos os componentes do projeto seguem os princípios SOLID para garantir um código coeso, flexível e fácil de manter.

### Tecnologias Utilizadas
- **Kotlin** para desenvolvimento nativo Android.
- **Android Jetpack** para gerenciamento de ciclo de vida e UI.
- **Retrofit** para consumo de APIs.
- **Coroutines** para operações assíncronas.
- **Dagger** para injeção de dependências.
- **Detekt** para análise estática de código.
- ...

### Módulos
O projeto está dividido nos módulos **app** e **core**

- **:app** - módulo padrão, contém os componentes do framework do Android.
- **:core** - contém regras de negócio, casos de uso e repositórios (nada relacionado com o framework Android)

```css
movieseriesbase/
├── app/
├── core/
```

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).
