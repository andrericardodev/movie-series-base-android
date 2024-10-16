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

- **:app** - módulo padrão, contém os componentes do framework do Android, camada mais externa.
- **:core** - contém regras de negócio, casos de uso e repositórios (nada relacionado com o framework Android), camada mais interna.

```css
movieseriesbase/
├── app/
├── core/
```

### Dependências
**- Navegação:** Navigation do Android Jetpack, *versão 2.8.2* - https://developer.android.com/guide/navigation

## Orientações

### Análise estática de código e formatação

No projeto, o *Detekt* está configurado para realizar análise estática de código, ajudando a identificar potenciais problemas de qualidade e estilo no código Kotlin. Para garantir a consistência e evitar falhas de qualidade, **execute a análise antes de realizar um commit ou push**.

- **Mac/Linux**: Execute o comando `./gradlew detekt`
- **Windows**: Execute o comando `gradlew detekt`

Além disso, é altamente recomendado instalar o plugin do **Ktlint** na IDE Android Studio para garantir a formatação correta do código automaticamente. O Ktlint auxilia na padronização de estilo, evitando problemas de formatação que possam interferir na qualidade do código.

Seguir essas práticas ajuda a manter o código alinhado com os padrões definidos e evita retrabalho desnecessário.




## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).
