$(document).ready(function() {

    //progress bar
    let containerA = document.getElementById("circleA");

    let circleA = new ProgressBar.Circle(containerA, {
        color: '#ADD8E6',
        strokeWidth: 8,
        duration: 1400,
        from: { color: '#AAA'},
        to: { color: '##ADD8E6'},

        step: function(state, circle){
            circle.path.setAttribute('stroke', state.color);

            let value = Math.round(circle.value() * 5265);

            circle.setText(value);
        }

    });

  //progress bar
      let containerB = document.getElementById("circleB");

      let circleB = new ProgressBar.Circle(containerB, {
          color: '#ADD8E6',
          strokeWidth: 8,
          duration: 2000,
          from: { color: '#AAA'},
          to: { color: '##ADD8E6'},

          step: function(state, circle){
              circle.path.setAttribute('stroke', state.color);

              let value = Math.round(circle.value() * 60);

              circle.setText(value);
          }

      });
  //progress bar
      let containerC = document.getElementById("circleC");

      let circleC = new ProgressBar.Circle(containerC, {
          color: '#ADD8E6',
          strokeWidth: 8,
          duration: 2100,
          from: { color: '#AAA'},
          to: { color: '##ADD8E6'},

          step: function(state, circle){
              circle.path.setAttribute('stroke', state.color);

              let value = Math.round(circle.value() * 264);

              circle.setText(value);
          }

      });
  //progress bar
      let containerD = document.getElementById("circleD");

      let circleD = new ProgressBar.Circle(containerD, {
          color: '#ADD8E6',
          strokeWidth: 8,
          duration: 2200,
          from: { color: '#AAA'},
          to: { color: '##ADD8E6'},

          step: function(state, circle){
              circle.path.setAttribute('stroke', state.color);

              let value = Math.round(circle.value() * 23);

              circle.setText(value);
          }

      });


      //iniciando o loader quando o usuario chega no elemento
      let dataAreaOffset = $('#data-area').offset();
      let stop = 0;

      $(window).scroll(function(e){
        let scroll = $(window).scrollTop();

        if(scroll > (dataAreaOffset.top - 500) && stop == 0) {
            circleA.animate(1.0);
            circleB.animate(1.0);
            circleC.animate(1.0);
            circleD.animate(1.0);

            stop = 1;
        }
      });

    //parallax
   // setTimeout serve para carregar primeiro as imagens
     setTimeout(function() {
       $('#data-area').parallax({imageSrc: '/img/new/cidadeparallax.png'});
     }, 250);




});