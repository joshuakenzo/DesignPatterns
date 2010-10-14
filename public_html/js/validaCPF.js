function checkCPF (CPF) {

                novoCpf = "";
                for (i = 0; i < CPF.length; i++) {
                    if ((CPF.charAt(i) >= "0") && (CPF.charAt(i) <= "9")) {
                        novoCpf += CPF.charAt(i);
                    }
                }
            
                if (novoCpf.length != 11 || novoCpf == "00000000000" || novoCpf == "11111111111" ||
                        novoCpf == "22222222222" ||	novoCpf == "33333333333" || novoCpf == "44444444444" ||
                        novoCpf == "55555555555" || novoCpf == "66666666666" || novoCpf == "77777777777" ||
                        novoCpf == "88888888888" || novoCpf == "99999999999") {
                    return false;
                }
                soma = 0;
                for (i=0; i < 9; i ++) {
                    soma += parseInt(novoCpf.charAt(i)) * (10 - i);
                }
                resto = 11 - (soma % 11);
                if (resto == 10 || resto == 11) {
                    resto = 0;
                }
                if (resto != parseInt(novoCpf.charAt(9))) {
                    return false;
                }
                soma = 0;
                for (i = 0; i < 10; i ++) {
                    soma += parseInt(novoCpf.charAt(i)) * (11 - i);
                }
                resto = 11 - (soma % 11);
                if (resto == 10 || resto == 11) {
                    resto = 0;
                }
                if (resto != parseInt(novoCpf.charAt(10))) {
                    return false;
                }
                return true;
            }