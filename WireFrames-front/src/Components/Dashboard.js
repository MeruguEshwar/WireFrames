import React from 'react';
import Header from './Header';
import banner from '../Images/banner.jpg';
import { Button } from '@mui/material';
import UploadIcon from '@mui/icons-material/Upload';

function Dashboard() {
    return (
        <div className='col-sm-12'>
            <div className='col-md-12'>
                <div className='col-xl-12'>
                    <Header />
                    <div className='banerimg container-fluid'>
                        <div className='txtheading'>
                            <h2 className='text-light fw-bolder fs-1'>File storage and sharing made simple</h2>
                        </div>
                        <div className='bannerbtn'>
                            <Button variant="contained" size="large" startIcon={<UploadIcon />}> UPLOAD FILES NOW</Button>
                        </div>
                    </div>

                    <div className='banericons'>
                        .roe
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Dashboard
