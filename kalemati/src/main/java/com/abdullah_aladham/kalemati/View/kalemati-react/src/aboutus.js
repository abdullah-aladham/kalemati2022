import React, { Component } from 'react';
import { Button } from 'react-bootstrap';

class Aboutus extends Component {
    
    render() {
        return (
            <div style={{ textAlign: 'center'}}>
<p >البطاقات الأكثر اعتمادا من مراكز النطق في فلسطين</p>
<img src={require("./images/aboutus.png")} style={{maxWidth:'400px'}} alt='about us' /><br/>
<Button variant='success'>Explore more</Button>
           </div>
        );
    }
}

export default Aboutus;