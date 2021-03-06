const accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
const authToken = 'your_auth_token';
const client = require('twilio')(accountSid, authToken);

client.notify
  .services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')
  .notifications.create({
    body: 'Knok-Knok! This is your first Notify SMS',
    toBinding: [
      JSON.stringify({
        binding_type: 'sms',
        address: '+1651000000000'
      }),
      JSON.stringify({
        binding_type: 'sms',
        address: '+1651000000001'
      })
    ]
  })
  .then(notification => console.log(notification.sid))
  .done();
