import React, { Component } from 'react';
import { MDBInput, MDBCheckbox, MDBBtn,MDBTextArea, MDBCardTitle } from 'mdb-react-ui-kit';

class ClassRoom extends Component {
    render() {
        return (
            <>
            <div>
                
            </div>
            <div>
            <form>
<MdLabel style={{color:'#f6b968'}}>Add Patient</MdLabel>
<MDBInput label ="Name" v-model='name' wrapperClass='mb-4'/>
    <MDBSelect>
        <MDBOption></MDBOption>
    </MDBSelect>
            </form>
            </div>
            </>
        );
    }
}

export default ClassRoom;