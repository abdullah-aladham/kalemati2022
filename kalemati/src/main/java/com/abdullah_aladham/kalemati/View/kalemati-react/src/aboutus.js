import React, { Component } from 'react';
import { Button } from 'react-bootstrap';

class Aboutus extends Component {
    
    render() {
        return (
            <div style={{ textAlign: 'center'}}>
<p >البطاقات الأكثر اعتمادا من مراكز النطق في فلسطين</p>
<img src="https://scontent.fjrs27-1.fna.fbcdn.net/v/t39.30808-6/313403317_509851644491334_9221079379178199362_n.png?_nc_cat=104&ccb=1-7&_nc_sid=e3f864&_nc_ohc=RwFLHUN_zVcAX_z66N7&_nc_ht=scontent.fjrs27-1.fna&oh=00_AfBY_wKbRGRs0kdkqf5rC0Ubykf7amMvBcKyL75dinIjEw&oe=64782E4F" style={{maxWidth:'400px'}} alt='about us' /><br/>
<Button variant='success'>Explore more</Button>
           </div>
        );
    }
}

export default Aboutus;