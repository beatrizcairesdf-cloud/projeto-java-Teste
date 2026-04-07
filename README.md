# projeto-java-Teste

O projeto possui dois workflows configurados no GitHub Actions:

Workflow 1: executa build, testes e deploy. Um teste foi criado propositalmente para falhar, demonstrando a validação do pipeline
(build ✅ → test ❌ → deploy ⛔)


Workflow 2: permite a continuação mesmo com falha nos testes (continue-on-error) e realiza o envio do relatório de testes (JUnit) como artifact no GitHub
(build ✅ → test ✅ → deploy ✅)
