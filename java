$.ajax({
       
  type: 'GET',

       url: 'http://apiusa.lookinbody.com/User/GetUser',

       contentType: 'application/json',

       data: {    "usertoken": "2137095959"
  },

       headers: {

              
    'Account': 'FitClub01',

              'API-KEY': 'v263CaEHmD60VCXovOFZ2ddoKiQjwyhSX47rzt8hxAk='

         
  },

       success: function(response) {
				          $('iD').text(response[0].ResponseText);

				          $('height').text(response[0].ResponseText);

				          $('weight').text(response[0].ResponseText);
       },

       error: function(error) {

               //Do something in case of error

         }

});
