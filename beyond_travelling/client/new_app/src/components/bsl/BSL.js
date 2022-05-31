import React, { useState, useEffect } from 'react';
// import HotelList from '../components/bsl/HotelList';
// import HotelDetail from '../components/bsl/HotelDetail';
import HotelDetail from '../components/wheelchair/HotelDetail';
import HotelList from '../components/wheelchair/HotelList';
import AccessibleHotels from '../components/wheelchair/AccessibleHotels';
// import ReactPlayer from 'react-player/lazy';


const BSL = () => {
    const [region, setRegions] = useState([]);
    const [selectedRegion, setSelectedRegion] = useState(null);

    useEffect(() => {
        getRegions();
    }, [])

    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))
    }

    const onRegionClick = function(region){
        setSelectedRegion(region);
    }

    // const onHotelSelected = function(hotel){
    //     setSelectedHotel(hotel);
    // }

    return (
        <div className="main-container">
            <HotelList regions={region} onRegionClick={onRegionClick} />
            {selectedRegion ? <HotelDetail selectedRegion={selectedRegion} /> : null}
            <AccessibleHotels />
            {/* <ReactPlayer url={'HomepageIntroCC'} /> */}
        </div>
    )
}

export default BSL;


