import React, { useState, useEffect } from 'react';
import HotelList from './HotelList';

const AccessibleHotels = () => {
    const [regions, setRegions] = useState([]);

    useEffect(() => {
        getRegions();
    }, [])

    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))
    }

    return (
        <>     
        <h3>Please choose a region</h3>

        <div className="main-container">
            <HotelList regions={regions}/>
        </div>
        </>

    );
};

export default AccessibleHotels;




