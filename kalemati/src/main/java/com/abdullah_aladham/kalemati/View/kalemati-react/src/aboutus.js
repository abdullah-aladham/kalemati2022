import React, { Component } from 'react';
import { Button } from 'react-bootstrap';

class Aboutus extends Component {
    
    render() {
        return (
            <div style={{ textAlign: 'center'}}>
<p >البطاقات الأكثر اعتمادا من مراكز النطق في فلسطين</p>
<img src="https://scontent.fjrs29-1.fna.fbcdn.net/v/t39.30808-6/313403317_509851644491334_9221079379178199362_n.png?_nc_cat=104&ccb=1-7&_nc_sid=e3f864&_nc_ohc=CG5r_H-NNN0AX_ShekW&_nc_ht=scontent.fjrs29-1.fna&oh=00_AfDkO4S0ECyc8tYNQAIxoYuMKavYS51oYBCu0BSRgIPqOQ&oe=6460734F" alt='about us' style={{maxWidth:'400px'}}/>
<Button variant='success'>Explore more</Button>
           </div>
        );
    }
}

export default Aboutus;