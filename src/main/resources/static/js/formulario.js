$('#form').submit(function(){
    var email = $('#email');
    var subject = $('#subject');
    var mensagem = $('#mensagem');
    var erro = $('.alert');
    var campo = $('#campo-erro');

    erro.addClass('d-none');
    $('.is-invalid').removeClass('is-invalid');

    if(email.val() == ''){

        erro.removeClass('d-none');
        campo.html('email');
        email.focus();
        email.addClass('is-invalid');
        return false;
    }

    if(subject.val() == ''){

            erro.removeClass('d-none');
            campo.html('assunto');
            email.focus();
            email.addClass('is-invalid');
            return false;
    }

    if(mensagem.val() == ''){

            erro.removeClass('d-none');
            campo.html('mensagem');
            email.focus();
            email.addClass('is-invalid');
            return false;
    }
    return true;
});